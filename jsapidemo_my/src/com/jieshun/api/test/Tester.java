package com.jieshun.api.test;

import com.jieshun.api.test.service.CardDelay;
import com.jieshun.api.test.service.CreateOrderByCard;
import com.jieshun.api.test.service.CreateOrderByCarno;
import com.jieshun.api.test.service.NotifyOrderResult;
import com.jieshun.api.test.service.OpenDoor;
import com.jieshun.api.test.service.QueryCarByCarno;
import com.jieshun.api.test.service.QueryCardDealyList;
import com.jieshun.api.test.service.QueryDoors;
import com.jieshun.api.test.service.QueryOrder;
import com.jieshun.api.test.service.QueryParkSpace;
import com.jieshun.api.test.service.QueryPersonsByCar;
import com.jieshun.api.test.service.QueryPersonsByTel;

/**
 * 测试类
 * @author 刘淦潮
 *
 */
public class Tester {
	public static void main(String[] args) {
		//3.1.2.1 查询人员门禁设备协议
		QueryDoors querydoors = new QueryDoors();
		querydoors.execute();
		//3.1.2.2	门禁开门协议
		OpenDoor openDoor=new OpenDoor();
		openDoor.execute();
		//3.2.2.1	生成订单协议
		CreateOrderByCard createorderbycard=new CreateOrderByCard();
		createorderbycard.execute();
		
		//3.2.2.2  支付结果通知协议
		NotifyOrderResult notifyorderresult=new NotifyOrderResult();
		notifyorderresult.execute();
		
		//3.3.2.1	查询相似车辆协议
		QueryCarByCarno querycarbycarno=new QueryCarByCarno();
		querycarbycarno.execute();
		
		//3.3.2.2	生成订单协议
		CreateOrderByCarno createorderbycarno=new CreateOrderByCarno();
		createorderbycarno.execute();
		
		//3.4	订单结果查询
		QueryOrder queryorder=new QueryOrder();
		queryorder.execute();
		
		//3.5	停车场空车位数查询
		QueryParkSpace queryparkspace=new QueryParkSpace();
		queryparkspace.execute();
		
		//3.6.2.1	查询人员卡信息-byTel
		QueryPersonsByTel querypersonsbytel=new QueryPersonsByTel();
		querypersonsbytel.execute();
		
		//3.7.2.1	查询人员卡信息
		QueryPersonsByCar querypersonsbycar=new QueryPersonsByCar();
		querypersonsbycar.execute();
		
		//3.8.2.1	月卡延期
		CardDelay carddelay=new CardDelay();
		carddelay.execute();
		
		//3.9.2.1	月卡缴费明细查询
		QueryCardDealyList querycarddealylist=new QueryCardDealyList();
		querycarddealylist.execute();
	}
}
