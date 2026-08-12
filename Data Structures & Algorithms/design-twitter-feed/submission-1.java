class Twitter {
    private static int timestamp = 0;
    private class Tweet {
        int id;
        int time;
        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    Map<Integer,Set<Integer>> following;
    Map<Integer,List<Tweet>> tweets;
    public Twitter() {
        following = new HashMap<>();
        tweets = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.computeIfAbsent(userId, k -> new ArrayList<>())
                .add(0, new Tweet(tweetId, timestamp++));
    }
    
    public List<Integer> result(List<Integer> userIdTweet,List<Integer> res){
        for(int i=0;i<userIdTweet.size() && i<10;i++){
            res.add(userIdTweet.get(i));
        }
        return res;
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a,b)-> b.time-a.time);

        if(tweets.containsKey(userId)){
            List<Tweet> tweet1 = tweets.get(userId);
            pq.addAll(tweet1);
        }
        
        Set<Integer> followings = following.get(userId);
        if(followings !=null && !followings.isEmpty()){
            for(Integer user : followings){
                if(tweets.containsKey(user))
                    pq.addAll(tweets.get(user));
            }
        }
        

        List<Integer> res = new ArrayList<>();
        int count = 0;
        while (!pq.isEmpty() && count < 10) {
            res.add(pq.poll().id);
            count++;
        }
        return res;

    }
    
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return; 
        following.computeIfAbsent(followerId, k -> new HashSet<>())
                .add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}
