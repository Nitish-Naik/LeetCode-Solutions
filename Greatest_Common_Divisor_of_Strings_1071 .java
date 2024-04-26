public class Greatest_Common_Divisor_of_Strings_1071  
{
        public String gcdOfStrings(String str1, String str2) 
        {
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            int maxLen = gcd(str1.length(), str2.length());
            return str1.substring(0, maxLen);
        }
        public int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }
