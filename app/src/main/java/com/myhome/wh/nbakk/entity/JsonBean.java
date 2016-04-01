package com.myhome.wh.nbakk.entity;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by Administrator on 2016/3/17 0017.
 */
public class JsonBean {

    /**
     * reason : 查询成功
     * result : {"title":"NBA2015-2016赛季_常规赛视频直播_腾讯体育","statuslist":{"st0":"未开赛","st1":"直播中","st2":"已结束"},"list":[{"title":"03-17 周四","tr":[{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/p/p7pyo1brw1ktl2f.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468070","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"雷霆","player1logo":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1logobig":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","player2":"凯尔特人","player2logo":"http://p5.qhimg.com/t019f61e3222cd24332.png","player2logobig":"http://p5.qhimg.com/t019f61e3222cd24332.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","score":"130-109","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/a/aqqyaho1zwhwrgh.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468071","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468071%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule.nba&m=aa92d8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468071%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule.nba&m=aa92d8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"魔术","player1logo":"http://p6.qhimg.com/t015a91103bd3713d72.png","player1logobig":"http://p6.qhimg.com/t015a91103bd3713d72.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","player2":"黄蜂","player2logo":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player2logobig":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","score":"99-107","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/h/haej11gtrkgca5j.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468072","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468072%26title%3D%25E5%25B0%258F%25E7%2589%259BVS%25E9%25AA%2591%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=0cb4c9&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468072%26title%3D%25E5%25B0%258F%25E7%2589%259BVS%25E9%25AA%2591%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=0cb4c9&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"小牛","player1logo":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player1logobig":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","player2":"骑士","player2logo":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player2logobig":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=5","score":"98-99","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/4/483tpve1wisur2j.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468073","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468073%26title%3D%25E5%2585%25AC%25E7%2589%259BVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=483d4a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468073%26title%3D%25E5%2585%25AC%25E7%2589%259BVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=483d4a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"公牛","player1logo":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player1logobig":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","player2":"奇才","player2logo":"http://p9.qhimg.com/t010558d60306395e77.png","player2logobig":"http://p9.qhimg.com/t010558d60306395e77.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","score":"96-117","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/l/lh5xbnf168fmgpm.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468074","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468074%26title%3D%25E8%2580%2581%25E9%25B9%25B0VS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=c0c275&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468074%26title%3D%25E8%2580%2581%25E9%25B9%25B0VS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=c0c275&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"老鹰","player1logo":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player1logobig":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","player2":"活塞","player2logo":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2logobig":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","score":"118-114","status":2,"time":"03/17 07:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/v/vachzez9r62rdqz.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468075","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468075%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25B0%25E7%2586%258A%26ptag%3D360.onebox.schedule.nba&m=663d3a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468075%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25B0%25E7%2586%258A%26ptag%3D360.onebox.schedule.nba&m=663d3a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"森林狼","player1logo":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1logobig":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2":"灰熊","player2logo":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player2logobig":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","score":"114-108","status":2,"time":"03/17 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/n/ncakog8896qo57t.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468076","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468076%26title%3D%25E5%25BF%25AB%25E8%2588%25B9VS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=ee3dc4&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468076%26title%3D%25E5%25BF%25AB%25E8%2588%25B9VS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=ee3dc4&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"快船","player1logo":"http://p5.qhimg.com/t01ac22731d284b6005.png","player1logobig":"http://p5.qhimg.com/t01ac22731d284b6005.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","player2":"火箭","player2logo":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2logobig":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","score":"122-106","status":2,"time":"03/17 09:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/4/4oymn7uqc8817l4.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468077","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468077%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E5%259B%25BD%25E7%258E%258B%26ptag%3D360.onebox.schedule.nba&m=f054aa&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468077%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E5%259B%25BD%25E7%258E%258B%26ptag%3D360.onebox.schedule.nba&m=f054aa&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"鹈鹕","player1logo":"http://p0.qhimg.com/t010415e17c8ec18459.png","player1logobig":"http://p0.qhimg.com/t010415e17c8ec18459.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","player2":"国王","player2logo":"http://p2.qhimg.com/t0179411022c3587ba2.png","player2logobig":"http://p2.qhimg.com/t0179411022c3587ba2.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","score":"123-108","status":2,"time":"03/17 10:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/d/dlj8o6paxg2ugga.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468078","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468078%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E5%258B%2587%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=f41526&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468078%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E5%258B%2587%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=f41526&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"尼克斯","player1logo":"http://p4.qhimg.com/t01eb9fe49a7bfa9614.png","player1logobig":"http://p4.qhimg.com/t01eb9fe49a7bfa9614.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18","player2":"勇士","player2logo":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player2logobig":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","score":"85-121","status":2,"time":"03/17 10:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nbadata.sports.qq.com/stats/player/2015playerstatsindex.html?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]},{"title":"03-18 周五","live":[{"player1":"开拓者","player1info":"胜35负34西部6名","player1location":"(客)","player1logobig":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","player2":"马刺","player2info":"胜58负10西部2名","player2location":"(主)","player2logobig":"http://p4.qhimg.com/t01865a1ad0b0987285.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24","score":"110-118","status":2,"title":"08:30开赛 比赛结束","liveurl":""}],"livelink":[{"text":"视频集锦","url":"http://v.qq.com/cover/i/io2kpkiexryutsg.html?ptag=360.onebox.schedule.nba"},{"text":"技术统计","url":"http://sports.qq.com/nbascore/?mid=1468085"}],"tr":[{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/w/w5qpgc9za659sy4.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468079","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468079%26title%3D%25E7%258C%259B%25E9%25BE%2599VS%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585%26ptag%3D360.onebox.schedule.nba&m=ab3f7c&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468079%26title%3D%25E7%258C%259B%25E9%25BE%2599VS%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585%26ptag%3D360.onebox.schedule.nba&m=ab3f7c&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"猛龙","player1logo":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player1logobig":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","player2":"步行者","player2logo":"http://p3.qhimg.com/t01a540cb8f7dae8bd7.png","player2logobig":"http://p3.qhimg.com/t01a540cb8f7dae8bd7.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11","score":"101-94","status":2,"time":"03/18 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/j/jpgto9nukz790iq.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468080","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468080%26title%3D%25E5%25A5%2587%25E6%2589%258DVS76%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=2827e8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468080%26title%3D%25E5%25A5%2587%25E6%2589%258DVS76%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=2827e8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"奇才","player1logo":"http://p9.qhimg.com/t010558d60306395e77.png","player1logobig":"http://p9.qhimg.com/t010558d60306395e77.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","player2":"76人","player2logo":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2logobig":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=20","score":"99-94","status":2,"time":"03/18 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/s/sifrhpr1g9a770z.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468081","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468081%26title%3D%25E9%25BB%2584%25E8%259C%2582VS%25E7%2583%25AD%25E7%2581%25AB%26ptag%3D360.onebox.schedule.nba&m=e143b3&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468081%26title%3D%25E9%25BB%2584%25E8%259C%2582VS%25E7%2583%25AD%25E7%2581%25AB%26ptag%3D360.onebox.schedule.nba&m=e143b3&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"黄蜂","player1logo":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player1logobig":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","player2":"热火","player2logo":"http://p3.qhimg.com/t011bd398c0da29c27d.png","player2logobig":"http://p3.qhimg.com/t011bd398c0da29c27d.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14","score":"109-106","status":2,"time":"03/18 07:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/p/pv1jm9sfkxn6s1u.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468082","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468082%26title%3D%25E6%258E%2598%25E9%2587%2591VS%25E8%2580%2581%25E9%25B9%25B0%26ptag%3D360.onebox.schedule.nba&m=a7dfab&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468082%26title%3D%25E6%258E%2598%25E9%2587%2591VS%25E8%2580%2581%25E9%25B9%25B0%26ptag%3D360.onebox.schedule.nba&m=a7dfab&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"掘金","player1logo":"http://p7.qhimg.com/t01c366fdb3044d96db.png","player1logobig":"http://p7.qhimg.com/t01c366fdb3044d96db.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","player2":"老鹰","player2logo":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player2logobig":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","score":"98-116","status":2,"time":"03/18 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/p/p10vvx98et2oii1.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468083","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468083%26title%3D%25E7%25AF%25AE%25E7%25BD%2591VS%25E5%2585%25AC%25E7%2589%259B%26ptag%3D360.onebox.schedule.nba&m=d21739&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468083%26title%3D%25E7%25AF%25AE%25E7%25BD%2591VS%25E5%2585%25AC%25E7%2589%259B%26ptag%3D360.onebox.schedule.nba&m=d21739&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"篮网","player1logo":"http://p7.qhimg.com/t01642d73a8ebb2f3b6.png","player1logobig":"http://p7.qhimg.com/t01642d73a8ebb2f3b6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=17","player2":"公牛","player2logo":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player2logobig":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","score":"102-118","status":2,"time":"03/18 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/1/16ol57h9pzqn3l7.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468084","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468084%26title%3D%25E7%2581%25B0%25E7%2586%258AVS%25E9%259B%2584%25E9%25B9%25BF%26ptag%3D360.onebox.schedule.nba&m=3dbb6d&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468084%26title%3D%25E7%2581%25B0%25E7%2586%258AVS%25E9%259B%2584%25E9%25B9%25BF%26ptag%3D360.onebox.schedule.nba&m=3dbb6d&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"灰熊","player1logo":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player1logobig":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","player2":"雄鹿","player2logo":"http://p3.qhimg.com/t010d8c56ac56f4de6b.png","player2logobig":"http://p3.qhimg.com/t010d8c56ac56f4de6b.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=15","score":"86-96","status":2,"time":"03/18 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/i/io2kpkiexryutsg.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468085","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468085%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E9%25A9%25AC%25E5%2588%25BA%26ptag%3D360.onebox.schedule.nba&m=bb544a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468085%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E9%25A9%25AC%25E5%2588%25BA%26ptag%3D360.onebox.schedule.nba&m=bb544a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"开拓者","player1logo":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1logobig":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","player2":"马刺","player2logo":"http://p4.qhimg.com/t01865a1ad0b0987285.png","player2logobig":"http://p4.qhimg.com/t01865a1ad0b0987285.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24","score":"110-118","status":2,"time":"03/18 08:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/q/q5xc9c3d1qe1t5d.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468086","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468086%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E7%2588%25B5%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=ebf76e&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468086%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E7%2588%25B5%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=ebf76e&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"太阳","player1logo":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1logobig":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2":"爵士","player2logo":"http://p9.qhimg.com/t01fd6c067295c676d3.png","player2logobig":"http://p9.qhimg.com/t01fd6c067295c676d3.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","score":"69-103","status":2,"time":"03/18 09:00"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nbadata.sports.qq.com/stats/player/2015playerstatsindex.html?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]},{"title":"03-19 周六","tr":[{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468087","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468087%26title%3D%25E9%25AA%2591%25E5%25A3%25ABVS%25E9%25AD%2594%25E6%259C%25AF%26ptag%3D360.onebox.schedule.nba&m=2d8c68&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"骑士","player1logo":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player1logobig":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=5","player2":"魔术","player2logo":"http://p6.qhimg.com/t015a91103bd3713d72.png","player2logobig":"http://p6.qhimg.com/t015a91103bd3713d72.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","score":"VS","status":0,"time":"03/19 07:00"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468088","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468088%26title%3D%25E9%259B%25B7%25E9%259C%2586VS76%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=c25050&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"雷霆","player1logo":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1logobig":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","player2":"76人","player2logo":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2logobig":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=20","score":"VS","status":0,"time":"03/19 07:00"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468089","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468089%26title%3D%25E5%259B%25BD%25E7%258E%258BVS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=5e4d60&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"国王","player1logo":"http://p2.qhimg.com/t0179411022c3587ba2.png","player1logobig":"http://p2.qhimg.com/t0179411022c3587ba2.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","player2":"活塞","player2logo":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2logobig":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","score":"VS","status":0,"time":"03/19 07:30"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468090","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468090%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS%25E7%258C%259B%25E9%25BE%2599%26ptag%3D360.onebox.schedule.nba&m=f8020a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"凯尔特人","player1logo":"http://p5.qhimg.com/t019f61e3222cd24332.png","player1logobig":"http://p5.qhimg.com/t019f61e3222cd24332.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","player2":"猛龙","player2logo":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player2logobig":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","score":"VS","status":0,"time":"03/19 07:30"},{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468091","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468091%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=26a4f3&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"森林狼","player1logo":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1logobig":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2":"火箭","player2logo":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2logobig":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","score":"VS","status":0,"time":"03/19 08:00"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468092","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468092%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E9%25B9%2588%25E9%25B9%2595%26ptag%3D360.onebox.schedule.nba&m=f0d9c0&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"开拓者","player1logo":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1logobig":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","player2":"鹈鹕","player2logo":"http://p0.qhimg.com/t010415e17c8ec18459.png","player2logobig":"http://p0.qhimg.com/t010415e17c8ec18459.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","score":"VS","status":0,"time":"03/19 08:00"},{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468093","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468093%26title%3D%25E5%258B%2587%25E5%25A3%25ABVS%25E5%25B0%258F%25E7%2589%259B%26ptag%3D360.onebox.schedule.nba&m=014954&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"勇士","player1logo":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player1logobig":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","player2":"小牛","player2logo":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player2logobig":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","score":"VS","status":0,"time":"03/19 08:30"},{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468094","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468094%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E6%25B9%2596%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=1c4abe&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"太阳","player1logo":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1logobig":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2":"湖人","player2logo":"http://p1.qhimg.com/t018b634f8a252b4177.png","player2logobig":"http://p1.qhimg.com/t018b634f8a252b4177.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=13","score":"VS","status":0,"time":"03/19 10:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nbadata.sports.qq.com/stats/player/2015playerstatsindex.html?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]}],"teammatch":[{"name":"老鹰","url":"http://sports.qq.com/nba/schedule/?team=hawks"},{"name":"凯尔特人","url":"http://sports.qq.com/nba/schedule/?team=celtics"},{"name":"鹈鹕","url":"http://sports.qq.com/nba/schedule/?team=pelicans"},{"name":"公牛","url":"http://sports.qq.com/nba/schedule/?team=bulls"},{"name":"骑士","url":"http://sports.qq.com/nba/schedule/?team=cavaliers"},{"name":"小牛","url":"http://sports.qq.com/nba/schedule/?team=mavericks"},{"name":"掘金","url":"http://sports.qq.com/nba/schedule/?team=nuggets"},{"name":"活塞","url":"http://sports.qq.com/nba/schedule/?team=pistons"},{"name":"勇士","url":"http://sports.qq.com/nba/schedule/?team=warriors"},{"name":"火箭","url":"http://sports.qq.com/nba/schedule/?team=rockets"},{"name":"步行者","url":"http://sports.qq.com/nba/schedule/?team=pacers"},{"name":"快船","url":"http://sports.qq.com/nba/schedule/?team=clippers"},{"name":"湖人","url":"http://sports.qq.com/nba/schedule/?team=lakers"},{"name":"热火","url":"http://sports.qq.com/nba/schedule/?team=heat"},{"name":"雄鹿","url":"http://sports.qq.com/nba/schedule/?team=bucks"},{"name":"森林狼","url":"http://sports.qq.com/nba/schedule/?team=timberwolves"},{"name":"篮网","url":"http://sports.qq.com/nba/schedule/?team=nets"},{"name":"尼克斯","url":"http://sports.qq.com/nba/schedule/?team=knicks"},{"name":"魔术","url":"http://sports.qq.com/nba/schedule/?team=magic"},{"name":"76人","url":"http://sports.qq.com/nba/schedule/?team=sixers"},{"name":"太阳","url":"http://sports.qq.com/nba/schedule/?team=suns"},{"name":"开拓者","url":"http://sports.qq.com/nba/schedule/?team=blazers"},{"name":"国王","url":"http://sports.qq.com/nba/schedule/?team=kings"},{"name":"马刺","url":"http://sports.qq.com/nba/schedule/?team=spurs"},{"name":"雷霆","url":"http://sports.qq.com/nba/schedule/?team=thunder"},{"name":"爵士","url":"http://sports.qq.com/nba/schedule/?team=jazz"},{"name":"奇才","url":"http://sports.qq.com/nba/schedule/?team=wizards"},{"name":"猛龙","url":"http://sports.qq.com/nba/schedule/?team=raptors"},{"name":"灰熊","url":"http://sports.qq.com/nba/schedule/?team=grizzlies"},{"name":"黄蜂","url":"http://sports.qq.com/nba/schedule/?team=hornets"}]}
     * error_code : 0
     */

    private String reason;
    /**
     * title : NBA2015-2016赛季_常规赛视频直播_腾讯体育
     * statuslist : {"st0":"未开赛","st1":"直播中","st2":"已结束"}
     * list : [{"title":"03-17 周四","tr":[{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/p/p7pyo1brw1ktl2f.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468070","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"雷霆","player1logo":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1logobig":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","player2":"凯尔特人","player2logo":"http://p5.qhimg.com/t019f61e3222cd24332.png","player2logobig":"http://p5.qhimg.com/t019f61e3222cd24332.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","score":"130-109","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/a/aqqyaho1zwhwrgh.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468071","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468071%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule.nba&m=aa92d8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468071%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule.nba&m=aa92d8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"魔术","player1logo":"http://p6.qhimg.com/t015a91103bd3713d72.png","player1logobig":"http://p6.qhimg.com/t015a91103bd3713d72.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","player2":"黄蜂","player2logo":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player2logobig":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","score":"99-107","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/h/haej11gtrkgca5j.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468072","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468072%26title%3D%25E5%25B0%258F%25E7%2589%259BVS%25E9%25AA%2591%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=0cb4c9&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468072%26title%3D%25E5%25B0%258F%25E7%2589%259BVS%25E9%25AA%2591%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=0cb4c9&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"小牛","player1logo":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player1logobig":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","player2":"骑士","player2logo":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player2logobig":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=5","score":"98-99","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/4/483tpve1wisur2j.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468073","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468073%26title%3D%25E5%2585%25AC%25E7%2589%259BVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=483d4a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468073%26title%3D%25E5%2585%25AC%25E7%2589%259BVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=483d4a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"公牛","player1logo":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player1logobig":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","player2":"奇才","player2logo":"http://p9.qhimg.com/t010558d60306395e77.png","player2logobig":"http://p9.qhimg.com/t010558d60306395e77.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","score":"96-117","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/l/lh5xbnf168fmgpm.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468074","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468074%26title%3D%25E8%2580%2581%25E9%25B9%25B0VS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=c0c275&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468074%26title%3D%25E8%2580%2581%25E9%25B9%25B0VS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=c0c275&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"老鹰","player1logo":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player1logobig":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","player2":"活塞","player2logo":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2logobig":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","score":"118-114","status":2,"time":"03/17 07:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/v/vachzez9r62rdqz.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468075","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468075%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25B0%25E7%2586%258A%26ptag%3D360.onebox.schedule.nba&m=663d3a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468075%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25B0%25E7%2586%258A%26ptag%3D360.onebox.schedule.nba&m=663d3a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"森林狼","player1logo":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1logobig":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2":"灰熊","player2logo":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player2logobig":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","score":"114-108","status":2,"time":"03/17 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/n/ncakog8896qo57t.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468076","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468076%26title%3D%25E5%25BF%25AB%25E8%2588%25B9VS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=ee3dc4&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468076%26title%3D%25E5%25BF%25AB%25E8%2588%25B9VS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=ee3dc4&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"快船","player1logo":"http://p5.qhimg.com/t01ac22731d284b6005.png","player1logobig":"http://p5.qhimg.com/t01ac22731d284b6005.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","player2":"火箭","player2logo":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2logobig":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","score":"122-106","status":2,"time":"03/17 09:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/4/4oymn7uqc8817l4.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468077","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468077%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E5%259B%25BD%25E7%258E%258B%26ptag%3D360.onebox.schedule.nba&m=f054aa&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468077%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E5%259B%25BD%25E7%258E%258B%26ptag%3D360.onebox.schedule.nba&m=f054aa&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"鹈鹕","player1logo":"http://p0.qhimg.com/t010415e17c8ec18459.png","player1logobig":"http://p0.qhimg.com/t010415e17c8ec18459.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","player2":"国王","player2logo":"http://p2.qhimg.com/t0179411022c3587ba2.png","player2logobig":"http://p2.qhimg.com/t0179411022c3587ba2.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","score":"123-108","status":2,"time":"03/17 10:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/d/dlj8o6paxg2ugga.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468078","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468078%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E5%258B%2587%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=f41526&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468078%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E5%258B%2587%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=f41526&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"尼克斯","player1logo":"http://p4.qhimg.com/t01eb9fe49a7bfa9614.png","player1logobig":"http://p4.qhimg.com/t01eb9fe49a7bfa9614.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18","player2":"勇士","player2logo":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player2logobig":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","score":"85-121","status":2,"time":"03/17 10:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nbadata.sports.qq.com/stats/player/2015playerstatsindex.html?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]},{"title":"03-18 周五","live":[{"player1":"开拓者","player1info":"胜35负34西部6名","player1location":"(客)","player1logobig":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","player2":"马刺","player2info":"胜58负10西部2名","player2location":"(主)","player2logobig":"http://p4.qhimg.com/t01865a1ad0b0987285.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24","score":"110-118","status":2,"title":"08:30开赛 比赛结束","liveurl":""}],"livelink":[{"text":"视频集锦","url":"http://v.qq.com/cover/i/io2kpkiexryutsg.html?ptag=360.onebox.schedule.nba"},{"text":"技术统计","url":"http://sports.qq.com/nbascore/?mid=1468085"}],"tr":[{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/w/w5qpgc9za659sy4.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468079","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468079%26title%3D%25E7%258C%259B%25E9%25BE%2599VS%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585%26ptag%3D360.onebox.schedule.nba&m=ab3f7c&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468079%26title%3D%25E7%258C%259B%25E9%25BE%2599VS%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585%26ptag%3D360.onebox.schedule.nba&m=ab3f7c&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"猛龙","player1logo":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player1logobig":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","player2":"步行者","player2logo":"http://p3.qhimg.com/t01a540cb8f7dae8bd7.png","player2logobig":"http://p3.qhimg.com/t01a540cb8f7dae8bd7.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11","score":"101-94","status":2,"time":"03/18 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/j/jpgto9nukz790iq.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468080","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468080%26title%3D%25E5%25A5%2587%25E6%2589%258DVS76%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=2827e8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468080%26title%3D%25E5%25A5%2587%25E6%2589%258DVS76%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=2827e8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"奇才","player1logo":"http://p9.qhimg.com/t010558d60306395e77.png","player1logobig":"http://p9.qhimg.com/t010558d60306395e77.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","player2":"76人","player2logo":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2logobig":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=20","score":"99-94","status":2,"time":"03/18 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/s/sifrhpr1g9a770z.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468081","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468081%26title%3D%25E9%25BB%2584%25E8%259C%2582VS%25E7%2583%25AD%25E7%2581%25AB%26ptag%3D360.onebox.schedule.nba&m=e143b3&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468081%26title%3D%25E9%25BB%2584%25E8%259C%2582VS%25E7%2583%25AD%25E7%2581%25AB%26ptag%3D360.onebox.schedule.nba&m=e143b3&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"黄蜂","player1logo":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player1logobig":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","player2":"热火","player2logo":"http://p3.qhimg.com/t011bd398c0da29c27d.png","player2logobig":"http://p3.qhimg.com/t011bd398c0da29c27d.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14","score":"109-106","status":2,"time":"03/18 07:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/p/pv1jm9sfkxn6s1u.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468082","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468082%26title%3D%25E6%258E%2598%25E9%2587%2591VS%25E8%2580%2581%25E9%25B9%25B0%26ptag%3D360.onebox.schedule.nba&m=a7dfab&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468082%26title%3D%25E6%258E%2598%25E9%2587%2591VS%25E8%2580%2581%25E9%25B9%25B0%26ptag%3D360.onebox.schedule.nba&m=a7dfab&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"掘金","player1logo":"http://p7.qhimg.com/t01c366fdb3044d96db.png","player1logobig":"http://p7.qhimg.com/t01c366fdb3044d96db.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","player2":"老鹰","player2logo":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player2logobig":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","score":"98-116","status":2,"time":"03/18 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/p/p10vvx98et2oii1.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468083","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468083%26title%3D%25E7%25AF%25AE%25E7%25BD%2591VS%25E5%2585%25AC%25E7%2589%259B%26ptag%3D360.onebox.schedule.nba&m=d21739&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468083%26title%3D%25E7%25AF%25AE%25E7%25BD%2591VS%25E5%2585%25AC%25E7%2589%259B%26ptag%3D360.onebox.schedule.nba&m=d21739&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"篮网","player1logo":"http://p7.qhimg.com/t01642d73a8ebb2f3b6.png","player1logobig":"http://p7.qhimg.com/t01642d73a8ebb2f3b6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=17","player2":"公牛","player2logo":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player2logobig":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","score":"102-118","status":2,"time":"03/18 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/1/16ol57h9pzqn3l7.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468084","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468084%26title%3D%25E7%2581%25B0%25E7%2586%258AVS%25E9%259B%2584%25E9%25B9%25BF%26ptag%3D360.onebox.schedule.nba&m=3dbb6d&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468084%26title%3D%25E7%2581%25B0%25E7%2586%258AVS%25E9%259B%2584%25E9%25B9%25BF%26ptag%3D360.onebox.schedule.nba&m=3dbb6d&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"灰熊","player1logo":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player1logobig":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","player2":"雄鹿","player2logo":"http://p3.qhimg.com/t010d8c56ac56f4de6b.png","player2logobig":"http://p3.qhimg.com/t010d8c56ac56f4de6b.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=15","score":"86-96","status":2,"time":"03/18 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/i/io2kpkiexryutsg.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468085","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468085%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E9%25A9%25AC%25E5%2588%25BA%26ptag%3D360.onebox.schedule.nba&m=bb544a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468085%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E9%25A9%25AC%25E5%2588%25BA%26ptag%3D360.onebox.schedule.nba&m=bb544a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"开拓者","player1logo":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1logobig":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","player2":"马刺","player2logo":"http://p4.qhimg.com/t01865a1ad0b0987285.png","player2logobig":"http://p4.qhimg.com/t01865a1ad0b0987285.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24","score":"110-118","status":2,"time":"03/18 08:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/q/q5xc9c3d1qe1t5d.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468086","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468086%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E7%2588%25B5%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=ebf76e&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468086%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E7%2588%25B5%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=ebf76e&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"太阳","player1logo":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1logobig":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2":"爵士","player2logo":"http://p9.qhimg.com/t01fd6c067295c676d3.png","player2logobig":"http://p9.qhimg.com/t01fd6c067295c676d3.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","score":"69-103","status":2,"time":"03/18 09:00"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nbadata.sports.qq.com/stats/player/2015playerstatsindex.html?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]},{"title":"03-19 周六","tr":[{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468087","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468087%26title%3D%25E9%25AA%2591%25E5%25A3%25ABVS%25E9%25AD%2594%25E6%259C%25AF%26ptag%3D360.onebox.schedule.nba&m=2d8c68&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"骑士","player1logo":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player1logobig":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=5","player2":"魔术","player2logo":"http://p6.qhimg.com/t015a91103bd3713d72.png","player2logobig":"http://p6.qhimg.com/t015a91103bd3713d72.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","score":"VS","status":0,"time":"03/19 07:00"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468088","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468088%26title%3D%25E9%259B%25B7%25E9%259C%2586VS76%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=c25050&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"雷霆","player1logo":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1logobig":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","player2":"76人","player2logo":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2logobig":"http://p0.qhimg.com/t01ca447da8c1f1be3f.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=20","score":"VS","status":0,"time":"03/19 07:00"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468089","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468089%26title%3D%25E5%259B%25BD%25E7%258E%258BVS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=5e4d60&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"国王","player1logo":"http://p2.qhimg.com/t0179411022c3587ba2.png","player1logobig":"http://p2.qhimg.com/t0179411022c3587ba2.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","player2":"活塞","player2logo":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2logobig":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","score":"VS","status":0,"time":"03/19 07:30"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468090","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468090%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS%25E7%258C%259B%25E9%25BE%2599%26ptag%3D360.onebox.schedule.nba&m=f8020a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"凯尔特人","player1logo":"http://p5.qhimg.com/t019f61e3222cd24332.png","player1logobig":"http://p5.qhimg.com/t019f61e3222cd24332.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","player2":"猛龙","player2logo":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player2logobig":"http://p3.qhimg.com/t0126c995f7a0e28ef3.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","score":"VS","status":0,"time":"03/19 07:30"},{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468091","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468091%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=26a4f3&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"森林狼","player1logo":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1logobig":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2":"火箭","player2logo":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2logobig":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","score":"VS","status":0,"time":"03/19 08:00"},{"link1text":"图文直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468092","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468092%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E9%25B9%2588%25E9%25B9%2595%26ptag%3D360.onebox.schedule.nba&m=f0d9c0&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"开拓者","player1logo":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1logobig":"http://p8.qhimg.com/t01fdabb4fd4f401729.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","player2":"鹈鹕","player2logo":"http://p0.qhimg.com/t010415e17c8ec18459.png","player2logobig":"http://p0.qhimg.com/t010415e17c8ec18459.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","score":"VS","status":0,"time":"03/19 08:00"},{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468093","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468093%26title%3D%25E5%258B%2587%25E5%25A3%25ABVS%25E5%25B0%258F%25E7%2589%259B%26ptag%3D360.onebox.schedule.nba&m=014954&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"勇士","player1logo":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player1logobig":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","player2":"小牛","player2logo":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player2logobig":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","score":"VS","status":0,"time":"03/19 08:30"},{"link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1468094","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468094%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E6%25B9%2596%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=1c4abe&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"","player1":"太阳","player1logo":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1logobig":"http://p8.qhimg.com/t01b949ab71ba5b6da6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2":"湖人","player2logo":"http://p1.qhimg.com/t018b634f8a252b4177.png","player2logobig":"http://p1.qhimg.com/t018b634f8a252b4177.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=13","score":"VS","status":0,"time":"03/19 10:30"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nbadata.sports.qq.com/stats/player/2015playerstatsindex.html?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]}]
     * teammatch : [{"name":"老鹰","url":"http://sports.qq.com/nba/schedule/?team=hawks"},{"name":"凯尔特人","url":"http://sports.qq.com/nba/schedule/?team=celtics"},{"name":"鹈鹕","url":"http://sports.qq.com/nba/schedule/?team=pelicans"},{"name":"公牛","url":"http://sports.qq.com/nba/schedule/?team=bulls"},{"name":"骑士","url":"http://sports.qq.com/nba/schedule/?team=cavaliers"},{"name":"小牛","url":"http://sports.qq.com/nba/schedule/?team=mavericks"},{"name":"掘金","url":"http://sports.qq.com/nba/schedule/?team=nuggets"},{"name":"活塞","url":"http://sports.qq.com/nba/schedule/?team=pistons"},{"name":"勇士","url":"http://sports.qq.com/nba/schedule/?team=warriors"},{"name":"火箭","url":"http://sports.qq.com/nba/schedule/?team=rockets"},{"name":"步行者","url":"http://sports.qq.com/nba/schedule/?team=pacers"},{"name":"快船","url":"http://sports.qq.com/nba/schedule/?team=clippers"},{"name":"湖人","url":"http://sports.qq.com/nba/schedule/?team=lakers"},{"name":"热火","url":"http://sports.qq.com/nba/schedule/?team=heat"},{"name":"雄鹿","url":"http://sports.qq.com/nba/schedule/?team=bucks"},{"name":"森林狼","url":"http://sports.qq.com/nba/schedule/?team=timberwolves"},{"name":"篮网","url":"http://sports.qq.com/nba/schedule/?team=nets"},{"name":"尼克斯","url":"http://sports.qq.com/nba/schedule/?team=knicks"},{"name":"魔术","url":"http://sports.qq.com/nba/schedule/?team=magic"},{"name":"76人","url":"http://sports.qq.com/nba/schedule/?team=sixers"},{"name":"太阳","url":"http://sports.qq.com/nba/schedule/?team=suns"},{"name":"开拓者","url":"http://sports.qq.com/nba/schedule/?team=blazers"},{"name":"国王","url":"http://sports.qq.com/nba/schedule/?team=kings"},{"name":"马刺","url":"http://sports.qq.com/nba/schedule/?team=spurs"},{"name":"雷霆","url":"http://sports.qq.com/nba/schedule/?team=thunder"},{"name":"爵士","url":"http://sports.qq.com/nba/schedule/?team=jazz"},{"name":"奇才","url":"http://sports.qq.com/nba/schedule/?team=wizards"},{"name":"猛龙","url":"http://sports.qq.com/nba/schedule/?team=raptors"},{"name":"灰熊","url":"http://sports.qq.com/nba/schedule/?team=grizzlies"},{"name":"黄蜂","url":"http://sports.qq.com/nba/schedule/?team=hornets"}]
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }


    public static class ResultBean {
        private String title;
        /**
         * st0 : 未开赛
         * st1 : 直播中
         * st2 : 已结束
         */

        private StatuslistBean statuslist;
        /**
         * title : 03-17 周四
         * tr : [{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/p/p7pyo1brw1ktl2f.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468070","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"雷霆","player1logo":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1logobig":"http://p8.qhimg.com/t0198101dee56f2e9e6.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","player2":"凯尔特人","player2logo":"http://p5.qhimg.com/t019f61e3222cd24332.png","player2logobig":"http://p5.qhimg.com/t019f61e3222cd24332.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","score":"130-109","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/a/aqqyaho1zwhwrgh.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468071","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468071%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule.nba&m=aa92d8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468071%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule.nba&m=aa92d8&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"魔术","player1logo":"http://p6.qhimg.com/t015a91103bd3713d72.png","player1logobig":"http://p6.qhimg.com/t015a91103bd3713d72.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","player2":"黄蜂","player2logo":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player2logobig":"http://p8.qhimg.com/t011105782c37d4f1c8.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","score":"99-107","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/h/haej11gtrkgca5j.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468072","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468072%26title%3D%25E5%25B0%258F%25E7%2589%259BVS%25E9%25AA%2591%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=0cb4c9&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468072%26title%3D%25E5%25B0%258F%25E7%2589%259BVS%25E9%25AA%2591%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=0cb4c9&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"小牛","player1logo":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player1logobig":"http://p8.qhimg.com/t016809e551c18d1ad5.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","player2":"骑士","player2logo":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player2logobig":"http://p0.qhimg.com/t0162a1fa2ce42538d1.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=5","score":"98-99","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/4/483tpve1wisur2j.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468073","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468073%26title%3D%25E5%2585%25AC%25E7%2589%259BVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=483d4a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468073%26title%3D%25E5%2585%25AC%25E7%2589%259BVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=483d4a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"公牛","player1logo":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player1logobig":"http://p7.qhimg.com/t0190ed8c80f7525b15.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","player2":"奇才","player2logo":"http://p9.qhimg.com/t010558d60306395e77.png","player2logobig":"http://p9.qhimg.com/t010558d60306395e77.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","score":"96-117","status":2,"time":"03/17 07:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/l/lh5xbnf168fmgpm.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468074","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468074%26title%3D%25E8%2580%2581%25E9%25B9%25B0VS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=c0c275&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468074%26title%3D%25E8%2580%2581%25E9%25B9%25B0VS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=c0c275&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"老鹰","player1logo":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player1logobig":"http://p3.qhimg.com/t015e29cacbb39ab2ea.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","player2":"活塞","player2logo":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2logobig":"http://p5.qhimg.com/t01a80ea5beeff44608.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","score":"118-114","status":2,"time":"03/17 07:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/v/vachzez9r62rdqz.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468075","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468075%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25B0%25E7%2586%258A%26ptag%3D360.onebox.schedule.nba&m=663d3a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468075%26title%3D%25E6%25A3%25AE%25E6%259E%2597%25E7%258B%25BCVS%25E7%2581%25B0%25E7%2586%258A%26ptag%3D360.onebox.schedule.nba&m=663d3a&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"森林狼","player1logo":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1logobig":"http://p8.qhimg.com/t0101b9d3f51b24df5c.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2":"灰熊","player2logo":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player2logobig":"http://p9.qhimg.com/t01c6cd06b91021cabb.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","score":"114-108","status":2,"time":"03/17 08:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/n/ncakog8896qo57t.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468076","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468076%26title%3D%25E5%25BF%25AB%25E8%2588%25B9VS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=ee3dc4&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468076%26title%3D%25E5%25BF%25AB%25E8%2588%25B9VS%25E7%2581%25AB%25E7%25AE%25AD%26ptag%3D360.onebox.schedule.nba&m=ee3dc4&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"快船","player1logo":"http://p5.qhimg.com/t01ac22731d284b6005.png","player1logobig":"http://p5.qhimg.com/t01ac22731d284b6005.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","player2":"火箭","player2logo":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2logobig":"http://p1.qhimg.com/t01b24bc0916fceab4a.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","score":"122-106","status":2,"time":"03/17 09:30"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/4/4oymn7uqc8817l4.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468077","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468077%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E5%259B%25BD%25E7%258E%258B%26ptag%3D360.onebox.schedule.nba&m=f054aa&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468077%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E5%259B%25BD%25E7%258E%258B%26ptag%3D360.onebox.schedule.nba&m=f054aa&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"鹈鹕","player1logo":"http://p0.qhimg.com/t010415e17c8ec18459.png","player1logobig":"http://p0.qhimg.com/t010415e17c8ec18459.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","player2":"国王","player2logo":"http://p2.qhimg.com/t0179411022c3587ba2.png","player2logobig":"http://p2.qhimg.com/t0179411022c3587ba2.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","score":"123-108","status":2,"time":"03/17 10:00"},{"link1text":"视频集锦","link1url":"http://v.qq.com/cover/d/dlj8o6paxg2ugga.html?ptag=360.onebox.schedule.nba","link2text":"技术统计","link2url":"http://sports.qq.com/nbascore/?mid=1468078","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468078%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E5%258B%2587%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=f41526&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468078%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E5%258B%2587%25E5%25A3%25AB%26ptag%3D360.onebox.schedule.nba&m=f41526&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f","player1":"尼克斯","player1logo":"http://p4.qhimg.com/t01eb9fe49a7bfa9614.png","player1logobig":"http://p4.qhimg.com/t01eb9fe49a7bfa9614.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18","player2":"勇士","player2logo":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player2logobig":"http://p0.qhimg.com/t01dae3099bd6904c43.png","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","score":"85-121","status":2,"time":"03/17 10:30"}]
         * bottomlink : [{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nbadata.sports.qq.com/stats/player/2015playerstatsindex.html?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]
         */

        private List<ListBean> list;
        /**
         * name : 老鹰
         * url : http://sports.qq.com/nba/schedule/?team=hawks
         */

        private List<TeammatchBean> teammatch;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public StatuslistBean getStatuslist() {
            return statuslist;
        }

        public void setStatuslist(StatuslistBean statuslist) {
            this.statuslist = statuslist;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<TeammatchBean> getTeammatch() {
            return teammatch;
        }

        public void setTeammatch(List<TeammatchBean> teammatch) {
            this.teammatch = teammatch;
        }

        public static class StatuslistBean {
            private String st0;
            private String st1;
            private String st2;

            public String getSt0() {
                return st0;
            }

            public void setSt0(String st0) {
                this.st0 = st0;
            }

            public String getSt1() {
                return st1;
            }

            public void setSt1(String st1) {
                this.st1 = st1;
            }

            public String getSt2() {
                return st2;
            }

            public void setSt2(String st2) {
                this.st2 = st2;
            }
        }

        public static class ListBean {
            private String title;
            /**
             * link1text : 视频集锦
             * link1url : http://v.qq.com/cover/p/p7pyo1brw1ktl2f.html?ptag=360.onebox.schedule.nba
             * link2text : 技术统计
             * link2url : http://sports.qq.com/nbascore/?mid=1468070
             * m_link1url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f
             * m_link2url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1468070%26title%3D%25E9%259B%25B7%25E9%259C%2586VS%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=bb4172&from=juhe&type=nba_new&juid=JH39e7b529ec08b244fc9ca41acde8685f
             * player1 : 雷霆
             * player1logo : http://p8.qhimg.com/t0198101dee56f2e9e6.png
             * player1logobig : http://p8.qhimg.com/t0198101dee56f2e9e6.png
             * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25
             * player2 : 凯尔特人
             * player2logo : http://p5.qhimg.com/t019f61e3222cd24332.png
             * player2logobig : http://p5.qhimg.com/t019f61e3222cd24332.png
             * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2
             * score : 130-109
             * status : 2
             * time : 03/17 07:00
             */
            private List<LiveBean> live;
            private List<LivelinkBean> livelink;

            public List<LiveBean> getLive() {
                return live;
            }

            public void setLive(List<LiveBean> live) {
                this.live = live;
            }

            public List<LivelinkBean> getLivelink() {
                return livelink;
            }

            public void setLivelink(List<LivelinkBean> livelink) {
                this.livelink = livelink;
            }

            private List<TrBean> tr;
            /**
             * text : 常规赛赛程
             * url : http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba
             */

            private List<BottomlinkBean> bottomlink;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<TrBean> getTr() {
                return tr;
            }

            public void setTr(List<TrBean> tr) {
                this.tr = tr;
            }

            public List<BottomlinkBean> getBottomlink() {
                return bottomlink;
            }

            public void setBottomlink(List<BottomlinkBean> bottomlink) {
                this.bottomlink = bottomlink;
            }


            public static class LiveBean {
                private String liveurl;
                private String player1;
                private String player1info;
                private String player1location;
                private String player1logobig;
                private String player1url;
                private String player2;
                private String player2info;
                private String player2location;
                private String player2logobig;
                private String player2url;
                private String score;
                private int status;
                private String title;


                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer1info() {
                    return player1info;
                }

                public void setPlayer1info(String player1info) {
                    this.player1info = player1info;
                }

                public String getPlayer1location() {
                    return player1location;
                }

                public void setPlayer1location(String player1location) {
                    this.player1location = player1location;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer2info() {
                    return player2info;
                }

                public void setPlayer2info(String player2info) {
                    this.player2info = player2info;
                }

                public String getPlayer2location() {
                    return player2location;
                }

                public void setPlayer2location(String player2location) {
                    this.player2location = player2location;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logbig) {
                    this.player2logobig = player2logbig;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLiveurl() {
                    return liveurl;
                }

                public void setLiveurl(String liveurl) {
                    this.liveurl = liveurl;
                }
            }

            public static class LivelinkBean {
                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class TrBean {
                private String link1text;
                private String link1url;
                private String link2text;
                private String link2url;
                private String m_link1url;
                private String m_link2url;
                private String player1;
                private String player1logo;
                private String player1logobig;
                private String player1url;
                private String player2;
                private String player2logo;
                private String player2logobig;
                private String player2url;
                private String score;
                private int status;
                private String time;

                public String getLink1text() {
                    return link1text;
                }

                public void setLink1text(String link1text) {
                    this.link1text = link1text;
                }

                public String getLink1url() {
                    return link1url;
                }

                public void setLink1url(String link1url) {
                    this.link1url = link1url;
                }

                public String getLink2text() {
                    return link2text;
                }

                public void setLink2text(String link2text) {
                    this.link2text = link2text;
                }

                public String getLink2url() {
                    return link2url;
                }

                public void setLink2url(String link2url) {
                    this.link2url = link2url;
                }

                public String getM_link1url() {
                    return m_link1url;
                }

                public void setM_link1url(String m_link1url) {
                    this.m_link1url = m_link1url;
                }

                public String getM_link2url() {
                    return m_link2url;
                }

                public void setM_link2url(String m_link2url) {
                    this.m_link2url = m_link2url;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer1logo() {
                    return player1logo;
                }

                public void setPlayer1logo(String player1logo) {
                    this.player1logo = player1logo;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer2logo() {
                    return player2logo;
                }

                public void setPlayer2logo(String player2logo) {
                    this.player2logo = player2logo;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class BottomlinkBean {
                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class TeammatchBean {
            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
