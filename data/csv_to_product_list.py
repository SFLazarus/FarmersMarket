import csv
import random
FIRST_NAMES = ['Joe', 'Bill', 'Sam', 'Jack', 'Mike','Jim', 'Steve']
LAST_NAMES = ['Hill', 'Street', 'Miller', 'Reed', 'Parker', 'Jackson', 'Fig']
with open('products.csv') as f:
    reader = csv.DictReader(f)
    for i, row in enumerate(reader):
        if (i == 0):
            continue
        name = row['Name']
        cost = "Cost is "+row['Price']+"USD"
        quantity = "Quantity is " + str(random.randint(1, 10))
        description = row["Description"]
        farmer_name = f"Farmer's Name is {random.choice(FIRST_NAMES)} {random.choice(LAST_NAMES)}"
        rating = "Rating is "+random.randrange(0,5)
        expiry = "Expires after " + row['Expiring Date']

        print(f'goods.add(new Product("{name}", "{cost}", "{quantity}", "{description}", "{farmer_name}", "{rating}", "{expiry}", R.drawable.product{i-1}_image));')