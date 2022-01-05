package me.bob.java.algorithm.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamForeachOrOrdered {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        AtomicInteger order = new AtomicInteger();
        strings.stream().parallel().forEach(System.out::print);
        System.out.println("-----------------------forEach");
        strings.stream().parallel().forEachOrdered(System.out::print);
        System.out.println("-----------------------forEachOrdered");

    }
}

/*
parallel 多线程并行处理
* forEach 输出顺序不能保证
forEachOrdered 按照原顺序输出
参考
java8 stream中 forEach和 forEachOrdered 当parallel时候执行过程&安全问题深入理解
https://blog.csdn.net/zhangshk_/article/details/80773161?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param
java8 stream 的元素执行顺序问题
https://blog.csdn.net/weixin_38569499/article/details/87875183


* */


/*
*  contentAddDTO.getImageList().stream()
                    .map(image -> {
                        int order = 0;
                        ContentImageInfo imageInfo = new ContentImageInfo();
                        imageInfo.setContentId(info.getId());
                        imageInfo.setImageUrl(image);
                        System.out.print(image);
//                        int or = order.getAndIncrement();
                        System.out.println("order ============="+order);
                        imageInfo.setImageOrder(order++);
                        imageInfo.setCreateTime(currentTime);
                        imageInfo.setUpdateTime(currentTime);
                        return imageInfo;
                    })
                    .sequential()
                    .forEachOrdered(contentImageInfoMapper::insertSelective);
                    *0order =============0
Fetched SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@6cbb02bd] from current transaction
Releasing transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@6cbb02bd]
1order =============0
Fetched SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@6cbb02bd] from current transaction
Releasing transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@6cbb02bd]
2order =============0
                    * order++ 从未被使用
                    *
                    * 参考：https://stackoom.com/question/21FVU/%E7%94%A8lambda%E8%A1%A8%E8%BE%BE%E5%BC%8Fjava%E5%AE%9E%E7%8E%B0%E8%AE%A1%E6%95%B0%E5%8F%98%E9%87%8F
*
* */