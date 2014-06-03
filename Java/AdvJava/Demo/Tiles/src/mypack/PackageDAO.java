package mypack;

import java.util.List;

public interface PackageDAO 
{
	List getPackages();
	List getSubPackages(String s);
}
