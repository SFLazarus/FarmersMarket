import random
import csv
farmer = True

products = []
with open('products.csv') as f:
    reader = csv.DictReader(f)
    for i, row in enumerate(reader):
        if (i == 0):
            continue
        products.append(row['Name'])
for i in range(30):
    print(f'<TextView android:layout_width="match_parent" android:layout_height="wrap_content" android:text="You ', end="")
    if farmer:
        print("sold ", end="")
    else:
        print("bought ", end="")
    print(f'{random.randint(1,5)}lbs of {random.choice(products)} on 1/{random.randint(1,30)}/20." />')