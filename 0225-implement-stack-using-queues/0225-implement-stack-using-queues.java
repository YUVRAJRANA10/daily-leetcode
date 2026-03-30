class MyStack {
Queue<Integer> a;
Queue<Integer> b;
    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }
    
    public void push(int x) {
        a.offer(x);
    }
    
    public int pop() {
        int size = a.size();
        while(a.size() > 1 ){
          int k = a.poll();
          b.offer(k);
          
        }


        int ans = a.poll();


        while(!b.isEmpty()){
            int k = b.poll();
            a.offer(k);
        }


        return ans;
        
    }
    
    public int top() {
        
        int size = a.size();
        while(a.size() > 1 ){
          int k = a.poll();
          b.offer(k);
          
        }


        int ans = a.poll();


        while(!b.isEmpty()){
            int k = b.poll();
            a.offer(k);
        }

        a.offer(ans);
        return ans;


    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */