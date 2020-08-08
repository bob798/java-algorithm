package me.bob.java.algorithm.design.pattern.observer;

public class Test {
    public static void main(String[] args) {
        User1 user1 = new User1();
        User2 user2 = new User2();
        WeChatPublicSubject wcPublic = new WeChatPublicSubject();
        wcPublic.add(user1);
        wcPublic.add(user2);

        wcPublic.notify(null);

        /*
        * 输出：
        * user1 收到  bob 公众号更新
          user2 收到  bob 公众号更新

        * */
    }
}
