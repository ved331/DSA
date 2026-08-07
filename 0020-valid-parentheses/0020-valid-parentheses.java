class Solution {
    public boolean isValid(String s) {
        Stack s1 = new Stack();

      for(int s2 = 0; s2 < s.length();s2++) {
         char s3 = s.charAt(s2);
         if (s3 != '(' && s3 != '{' && s3 != '[') {
            if (s1.isEmpty()) {
               return false;
            }

            if (((Character)s1.peek() != '(' || s3 != ')') && ((Character)s1.peek() != '{' || s3 != '}') && ((Character)s1.peek() != '[' || s3 != ']')) {
               return false;
            }

            s1.pop();
         } else {
            s1.push(s3);
         }
      }

      return s1.isEmpty();
   }
    }
