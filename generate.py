import os

BASE_URL = "https://T0p2.github.io/repo-desarollo-web-automatizado"

def generate_html_for_directory(path, relative_url):
    dir_name = os.path.basename(path)
    html_filename = f"{dir_name}.html"
    
    html_content = f"""
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>{dir_name}</title>
    </head>
    <body>
        <h1>{dir_name}</h1>
        <ul>
    """
    
    items = sorted(os.listdir(path))
    for item in items:
        item_path = os.path.join(path, item)
        item_url = os.path.join(relative_url, item).replace("\\", "/")
        if os.path.isdir(item_path):
            # Enlace a subdirectorio
            html_content += f'<li><a href="/{item_url}/{item}.html">{item}</a></li>\n'
            generate_html_for_directory(item_path, item_url)
        else:
            # Enlace a archivo
            file_url = f"{BASE_URL}/{item_url}"
            html_content += f'<li><a href="{file_url}" target="_blank">{item}</a></li>\n'
    
    html_content += """
        </ul>
    </body>
    </html>
    """
    
    with open(os.path.join(path, html_filename), 'w') as f:
        f.write(html_content)

def generate_main_index_html(base_dir):
    html_content = """
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Índice de Materias</title>
    </head>
    <body>
        <h1>Índice de Materias</h1>
        <ul>
    """
    
    for item in sorted(os.listdir(base_dir)):
        item_path = os.path.join(base_dir, item)
        if os.path.isdir(item_path):
            item_url = os.path.join("materias", item, f"{item}.html").replace("\\", "/")
            html_content += f'<li><a href="/{item_url}">{item}</a></li>\n'
    
    html_content += """
        </ul>
    </body>
    </html>
    """
    
    with open('index.html', 'w') as f:
        f.write(html_content)

def main():
    base_dir = 'materias'
    generate_html_for_directory(base_dir, 'materias')
    generate_main_index_html(base_dir)

if __name__ == "__main__":
    main()
