public class Stack {

    int size;
    int[] array;
    int index=-1;

    public Stack() {
        this.size = 10;
        this.array = new int[size];
    }

    public Stack(int size, int[] array) {
        this.size = size;
        this.array = array;
    }

    public void add(int newElement) {
        index++;
        if (index < size) {
            array[index] = newElement;

        } else {
            int[] newArray = new int[2 * size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            size *= 2;
            this.array = newArray;
            array[index] = newElement;
        }
    }

    public void remove() {
        if (index != -1) {
            array[index] = 0;
            index--;
        } else
            System.out.println("The stack is empty!");
    }

    public String toString() {
        String result = "";
        for (int element : array)
            result = result+" "+element;
        return result;
    }
}
