import math

# low memory method
for _ in range(int(input())):
    n = int(input())
    k_sum = 0
    for i in range(2, n + 1):
        k_sum += math.log(i, 10)

    k_sum = math.floor(k_sum) + 1

    sum = 0
    for j in range(k_sum):
        prod_a = 1
        prod_b = 1
        for k in range(1, n + 1):
            prod_a *= k % (10 ** (j + 1))
            prod_b *= k % (10 ** j)

        prod_a = prod_a % 10 ** (j + 1)
        prod_b = prod_b % 10 ** j

        d = (prod_a - prod_b) / (10 ** j)
        sum += d

    print(int(sum))

# normal faster method
for _ in range(int(input())):
    n = int(input())
    product = 1
    for i in range(2, n + 1):
        product *= i

    total = 0
    for digit in str(product):
        total += int(digit)

    print(total)
