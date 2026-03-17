roman_input = input("Enter a Roman numeral: ")

roman_values = {
    "I": 1,
    "V": 5,
    "X": 10,
    "L": 50,
    "C": 100,
    "D": 500,
    "M": 1000
}

output = 0

for i in range(len(roman_input)):
    current = roman_values[roman_input[i]]
    if i + 1 < len(roman_input) and current < roman_values[roman_input[i + 1]]:
        output -= current
    else:
        output += current

print(output)
