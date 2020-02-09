import csv

with open('products.csv') as f:
    reader = csv.DictReader(f)
    for i, row in enumerate(reader):
        if i == 0:
            continue
        num = i-1
        print(f'<string name="product{num}_name">{row["Name"]}</string>')
        print(f'<string name="product{num}_description">{row["Description"]}</string>')
        print(f'<string name="product{num}_expiration">{row["Expiring Date"]}</string>')
        print()