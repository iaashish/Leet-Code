Class GetKRowPascal {
    public List<Integer> getRow(int rowIndex) {
        //we just need one list and we need to update the list item accordingly
        List<Integer> data = new ArrayList<>();
        //initially add 1 as the starting element
        data.add(1);
        //iterate using row index
        for(int i = 1;i<=rowIndex; i++){
            //change the value of the list item on iteration
            //if i=1 nothing happens list will be [1,1]
            //if i = 2 list will be [1,2,1] because 2 position will be changed using set
            //similar fashion on i=3, [1,3,3, 1]
            for(int j = i-1; j>= 1; j--){
                //j=2,[1,2,3]
                //j=1, [1,3,3]
                data.set(j, data.get(j)+ data.get(j-1));
            }
            data.add(1);
        }
        return data;
    }
}