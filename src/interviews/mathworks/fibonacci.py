
def trailing_zeroes_fibo(n):

	i = 5
	count = 0
	while (n/i >= 1):
		count += n/i
		i *= 5
	return count


def main():
	print(trailing_zeroes_fibo(100))

if __name__ == "__main__":
	main()