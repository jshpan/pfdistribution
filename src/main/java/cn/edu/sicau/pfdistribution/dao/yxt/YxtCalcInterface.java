package cn.edu.sicau.pfdistribution.dao.yxt;

public interface YxtCalcInterface
{
    //获取两站间里程
    public double GetDistanceOfTwoStation(int czid1,int czid2);
    //获取某区间里程
    public double GetDistanceOfSection(int qjid);

    //计算2站间运行时分
    public int getRunTimesOfTwoStation(int czid1,int czid2,int lczlh);
    //计算某区间运行时分
    public int getRunTimesOfSection(int qjid,int lczlh);

    //计算2站间行车量
    public int GetTrainNumsOfTwoStation(int czid1,int czid2,int lctzh);
    //获取2站间列车序号
    public int[] GetTrainsOfTowStation(int czid1,int czid2,int lctzh);
    //计算某区间行车量
    public int GetTrainNumsOfSection(int qjid,int lctzh);
    //获取某区间列车序号
    public int[] GetTrainsOfSection(int qjid,int lctzh);

    //判断某站是否为换乘站
    public boolean CheckStationIsHcz(int czid);
    //获取两站间换乘时间，秒
    public int   GetJxTimeOfTowStation(int czid1,String infxm,int czid2,String outfxm);

    //获取某列车在某站停站时间
    public short GetTrainStopTime(int nlcxh,int nczh);

    //根据车站名获取车站号
    public int GetCzidFromCzm(String czm);
    //根据两站名获取区间号
    public int GetQjidFromCzm(String czm1,String czm2);
    //根据车站返回所属线路名
    public String GetXlmFromCzm(String czm);
    //根据前后站关系获取换乘时间
    //车站站顺位czm1--hczm--czm2
    public int GetHcTimeFromCz(String czm1,String hczm,String czm2);
}
