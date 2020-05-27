package Day06;
/**
 * @Author: ZhuXianfei
 * @Date: 2020/5/27 13:04
 * @Revision: 1.0
 * @Description:
 */


public class demo01 {
    /**
     * IP 地址无效化
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     *
     * 示例 1：
     * 输入：address = "1.1.1.1"
     * 输出："1[.]1[.]1[.]1"
     *
     * 示例 2：
     * 输入：address = "255.100.50.0"
     * 输出："255[.]100[.]50[.]0"
     */

    //这也太简单了，增强信心？
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        demo01 d1 = new demo01();
        String IP = "127.0.0.1";

        System.out.println(d1.defangIPaddr(IP));

    }
}
