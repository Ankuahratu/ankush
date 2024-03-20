package factors_problems;

public class best {
// 
 static void dis(int start ,int n) {
  int p=0;
//  for (int i = end; ; i--) {static void dis(int start ,int n) {
//int p=0;
  for (int i = start;; i++) {
      if (helper(i)) {
          System.out.println(i);
          p++;
      }
      if(p==n){
          break;
      }
  }
}

static boolean helper(int num) {
  int c = 0;
  for (int i = 2; i <= num-1; i++) {
      if (num % i == 0) {
          c++;
      }

  }
  if (c == 0) {
      return true;
  }
  return false;
}

public static void main(String[] args) {
  dis(100,3);
}
}




