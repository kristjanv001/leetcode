class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carryOver = 0;

        while (i >= 0 || j >= 0) {
            int sum = carryOver;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }

            sb.append(sum % 2);
            carryOver = sum / 2;
            
            i--;
            j--;   
        }
        
        if (carryOver != 0) {
            sb.append(carryOver);
        }
        
        return sb.reverse().toString();
    }
}

