package mypack;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public interface TourDAO 
{
	void add(Search ref);
	@SuppressWarnings("rawtypes")
	List get(Date startdate,Date enddate);
	@SuppressWarnings("rawtypes")
	List getcost(String cost1,String cost2);
	@SuppressWarnings("rawtypes")
	List getduration(String duration1,String duration2);
}
