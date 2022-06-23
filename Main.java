package Z字形变换;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String s ="PAYPALISHIRING";
        int num = 1;
        Solution solution = new Solution();
        s = solution.convert(s,num);
        System.out.println(s);
    }
}
class Solution {
    public String convert(String s, int numRows) {
        ArrayList<String> list= new ArrayList();
        int flag = -1;
        int index = 0;

        if (numRows == 1)
            return s;

        for(int i = 0; i < numRows; i ++){
            list.add("");
        }

        for(int i = 0;i < s.length();i++){
            list.set(index,list.get(index)+s.charAt(i));
            if(index == 0 || index == numRows-1) flag *= -1;
            index += flag;
        }

        String ans = "";
        for(int i = 0; i < numRows; i ++){
            ans += list.get(i);
        }
        return ans;
    }
}
