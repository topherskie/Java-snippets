import java.time.LocalDate;

class Main {
  
  public static void main(String[] args) {
// given value 
float x = 23f;
float y = 56f;
    currentDate();
    welcomeMsg();
    addValue(x, y);
    subValue(x, y);
    multValue(x, y);
    divValue(x, y);
    modValue(x, y);  
  }

// get current date
static void currentDate() {
   LocalDate currentDate = LocalDate.now();
   System.out.println(currentDate);
}

// welcome message
  static void welcomeMsg() {
    System.out.println("Welcome Title!");
  }

// add 
  static void addValue(float x, float y) {
    System.out.println(x + y);
  }

// subtract
  static void subValue(float x, float y) {
    System.out.println(x - y);
  }

// multiply
  static void multValue(float x, float y) {
    System.out.println(x * y);
  }

// divide 
  static void divValue(float x, float y) {
    System.out.println(x / y);
  }

  // mod 
   static void modValue(float x, float y) {
    System.out.println(x % y);
  }


  
} // end of Main class method
