//문제 05 - 7.1

class Prob1 {
    public static void main(String[] args) {
        for(int i = 2; i < 9; i++) {
            int v = 1;
            if((i == 2) || (i == 4) || (i ==8)) {
                for(int s = 1; s <= i; s++) {
                    System.out.println(i * v);
                    v++;
                }
            }
        }
    }
}

//문제 05 - 7.2

class Cal {
    public static void main(String[] args) {
        for(int a = 0; a <= 9; a++) {
            for(int b = 0; b <= 9; b++) {
                if((a*11) + (b*11) == 99){
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println("-------------");
                }
            }
        }
    }
}

//문제 06 - 1.1

class MethodCal {
    public static void main(String[] args) {
        cal(4, 2);
    }

    public static void cal(int num1, int num2) {
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1  * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}

//문제 06 - 1.2

class AbsoluteNum {
    public static void main(String[] args) {
        absolute(2, 4);
    }

    public static void absolute(int num1, int num2) {
        System.out.println(Math.abs(num1 - num2)); //이거 Math.abs()를 통해서 절대값 쉽게 만들 수 있음
    }
}

//문제 06 - 2.1

class Circle {
    public static void main(String[] args) {
        System.out.println(circumference(3));
        System.out.println(area(3));
    }

    public static double circumference(int num1) {
        return num1 * 2 * 3.14;
    }

    public static double area(int num1) {
        return num1 * num1 * 3.14;
    }
}


// 문제 06 - 2.2

class FindPrimeNumber {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
           if(PrimeNumber(i))
               	System.out.println(i);
        }
    }
    
    public static boolean PrimeNumber(int num) {
        if(num == 1)
            return false;
        
        for(int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        
        return true;
    }
}

//문제 06 - 3.1, 3.2

//문제 





