names = ["pablo", "matias", "noam"]

alongP = [p for p in names if p[0] == "p"]
print(alongP)

bottleC = [
    {"name": "quilmes", "country": "arg"},
    {"name": "corona", "country": "mx"},
    {"name": "stella artois", "country": "belgium"}
]

arg = [b for b in bottleC if b["country"] == "arg"]

print(arg)
print(bottleC)