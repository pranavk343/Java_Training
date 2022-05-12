public class Question1 {
    static int ArmStrong(int i){
        int originalNumber, remainder, result=0;
        originalNumber = i;
        while(originalNumber!=0){
            remainder = originalNumber%10;
            result += Math.pow((double) remainder,3);
            originalNumber /= 10;
        }
        if(result==i){
            return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int x =ArmStrong(i);
            if(x>0){
                System.out.println(i);
            }
        }
    }
}