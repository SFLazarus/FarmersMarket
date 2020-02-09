import random
FIRST_NAMES = ['Joe', 'Bill', 'Sam', 'Jack', 'Mike','Jim', 'Steve']
LAST_NAMES = ['Hill', 'Street', 'Miller', 'Reed', 'Parker', 'Jackson', 'Fig']
HOBBIES = ['Fishing', 'Carpentry', 'Hunting', 'Spending Time with Family']
ADJECTIVES = ['masterful', 'powerful', 'clever', 'creative', 'wise', 'forward-thinking']
HOME = ['Lenexa', 'Lawrence', 'Wichita', 'Stockholm']
def generateBio(name):
    return f"{name} is a {random.choice(ADJECTIVES)} farmer from {random.choice(HOME)}. He enjoys {random.choice(HOBBIES)} in his free time."

for i in range(10):
    name = f"{random.choice(FIRST_NAMES)} {random.choice(LAST_NAMES)}"
    print(f'<TextView android:layout_width="match_parent" android:layout_height="wrap_content" android:text="{generateBio(name)}" />')

