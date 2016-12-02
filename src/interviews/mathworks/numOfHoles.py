
def number_of_holes (number):

	holes = [1, 0, 0, 0, 1, 0, 1, 0, 2, 1]
	n = str(number)
	count = 0

	for each in n:
		count += holes[int(each)]

	return count

def string_manip (myStr):
	myStr[2] = 'a'
	myStr[3] = 'r'
	print(myStr)

def main():
	print(number_of_holes(123), "holes")
	string_manip('wardom')

if __name__ == "__main__":
	main()