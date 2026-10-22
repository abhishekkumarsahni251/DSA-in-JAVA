public class nestedIfElse {
    public static void main(String[] args) {
       int age = 20;
       char gender = 'M';
       if (gender =='m'){
        System.out.println("you are a male");
        if (age>18){
            System.out.println("you are male and age>18");
        }
          
     else {
        System.out.println("your are male and age <=18");
     }
    }
    else{
        System.out.println("you are not a male "); 
if (age >18){
    System.out.println("you are not a male and age >18");
} 
else{
    System.out.println("you are not a male and age<=18");
}
    }

    }
}
