package cn.edu.sicau.pfdistribution;

import cn.edu.sicau.pfdistribution.config.ConfigJDBC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PfdistributionApplicationTests {

  @Autowired
  private ConfigJDBC dataSource;//创建jdbctemplate对象，并使用spring的自动注入完成实例化

  static final Logger logger = LoggerFactory.getLogger(PfdistributionApplicationTests.class);

  @Test
  public void updateTest() {


    try {
      Connection connection = dataSource.getDataSource().getConnection();
      logger.info("连接成功");
      System.out.println(connection);
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
