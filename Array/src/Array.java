public class Array<Element> {
    private Element[] data;
    private int size;

    public Array(int capacity) {
        data = (Element[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(Element e) {
        add(size, e);
    }

    public void addFirst(Element e) {
        add(0, e);
    }

    public void add(int index, Element e) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index > 0 and index <= size. ");
        }

        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    public Element get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal. ");
        }
        return data[index];
    }

    public void set(int index, Element e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal. ");
        }
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d. \n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public boolean contains(Element e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int find(Element e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public Element remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal. ");
        }

        Element ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return ret;
    }

    public Element removeFirst() {
        return remove(0);
    }

    public Element removeLast() {
        return remove(size - 1);
    }

    public boolean removeElement(Element e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public boolean removeAllElement(Element e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                remove(i);
            }
        }
        if (find(e) != -1) {
            return false;
        }
        return true;
    }

    private void resize(int newCapacity) {
        Element newData[] = (Element[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;

    }
}

