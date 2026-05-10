class MinStack {
    
    private  ArrayList<Integer> min ;
    private ArrayList<Integer> st ;  

    public MinStack() {
        min = new ArrayList<>();
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        st.add(val);

        if(min.isEmpty() || val<=min.get(min.size()-1)){
            min.add(val);
        }
    }
    
    public void pop() {
        int removed = st.remove(st.size()-1);

        if(min.get(min.size()-1) == removed){
            min.remove(min.size()-1);
        }
        
    }
    
    public int top() {
        return this.st.get(this.st.size()-1);
        
    }
    
    public int getMin() {


        return this.min.get(this.min.size()-1) ;
    }
}
