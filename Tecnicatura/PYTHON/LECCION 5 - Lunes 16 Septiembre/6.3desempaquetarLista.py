def show(name, lastname):
    print(name, lastname)

person = ["joaquin", "peralta"]

show(person[0], person[1])
show(*person)

person2 = ('micaela', "gomila")
show(*person2)

person3 = {"name": "claudio", "lastname": "alvarez"}
show(**person3)