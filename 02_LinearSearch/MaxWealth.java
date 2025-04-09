public class MaxWealth {

    static int accounts(int[][] accounts){

        // Person --> row
        // accounts --> col
        int ans = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];                
            }
            // Now we have sum of acocunts of persons
            // check with Our all Answer
            if (sum > ans) {
                ans = sum;
            }
            
        }
        

        // Using ForEach Loop
        // for (int[] person : accounts) {
        //     int sum = 0;
        //     for (int persons : person) {
        //         sum += persons;
        //     }
        //     if (sum > ans) {
        //         ans = sum;
        //     }
        // }


        return ans;    
    };

    public static void main(String[] args) {
        
        int[][] arr = {

            {5, 7, 3},
            {2, 8},
            {6, 7, 5},
        };

        System.out.println(accounts(arr));
       



    }
}
