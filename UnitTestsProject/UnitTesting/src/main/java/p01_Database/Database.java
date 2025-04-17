package p01_Database;

import javax.naming.OperationNotSupportedException;

public class Database {

    private Integer[] elements;
    private int elementsCount = 0;
    private int index;


    public Database(Integer... elements) throws OperationNotSupportedException {
        this.elementsCount = elements.length;
        this.setElements(elements);
        this.index = elementsCount - 1;
    }

    // 1. ако подам стойност null -> грешка
    // 2. ако подам реално число -> добавям числото на последна позиция, също така увеличавам броя на числата с 1
    public void add(Integer element) throws OperationNotSupportedException {
        if (element == null) {
            throw new OperationNotSupportedException();
        }

        this.elements[++index] = element;
        this.elementsCount++;
    }

    // ако премахна числа от не празна база данни -> числата ще намалеят с 1
    // ако се опитам да премахна число от празен арей -> грешка
    public void remove() throws OperationNotSupportedException {
		try {
			this.elements[index--] = null;
			this.elementsCount--;			
		} catch (ArrayIndexOutOfBoundsException ex) {
			throw new OperationNotSupportedException();
		}
    }

    public Integer[] getElements() {
        Integer[] buffer = new Integer[elementsCount];
        int bufferIndex = 0;

        for (Integer element : elements) {
            if (element != null) {
                buffer[bufferIndex++] = element;
            }
        }

        return buffer;
    }

    // 1. създавам база от данни с повече от 16 числа -> грешка
    // 2. създавам база от данни с 0 числа -> грешка
    // 3. създавам база база с числа между 1 и 16 числа -> успяшно създавам база от данни
    private void setElements(Integer... elements) throws OperationNotSupportedException {
        if (elements.length > 16 ||
                elements.length < 1) {
            throw new OperationNotSupportedException();
        }

        this.elements = new Integer[16];
        int bufferIndex = 0;

        for (Integer element : elements) {
            this.elements[bufferIndex++] = element;
        }

        this.index = elements.length - 1;
    }
}
