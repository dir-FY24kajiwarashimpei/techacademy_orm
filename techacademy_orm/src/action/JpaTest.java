package action;

import javax.persistence.EntityManager;
import entity.City;
import entity.DBUtil;

public class JpaTest {

    public static void main(String[] args) {
        //EntityManagerオブジェクトを生成
        EntityManager em = entity.DBUtil.createEntityManager();
        
        //1権取得して名前を表示する
        City city = em.find(City.class, 1);
        System.out.println(city.getName());
        
        //EntityManagerの利用を終了する
        em.close();

    }

}
