# Python Program to reverse an array using a temporary array

#funtion taken for reverse array
def reverse_array(arr):
    n = len(arr)  #def len of array
    temp = [0] * n  # new variable temp for reversing string

    for i in range(n):            #main logic here n = length , i = array elements
        temp[i] = arr[n - 1 - i]

    for i in range(n):     # temp ke variable copy back to arr joh output hai
        arr[i] = temp[i]

if __name__ == "__main__":             
    # Take user input for array elements
    user_input = input("Enter array elements separated by spaces: ")
    arr = list(map(int, user_input.strip().split()))

    reverse_array(arr)

    print("Reversed array:", *arr)
