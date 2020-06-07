package com.cute.utils;

import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BeanUtil {
	
	public static <T> T fillBean(HttpServletRequest request, Class<T> cls) throws InstantiationException {
		
		T bean= null;		
		try {
			 bean = cls.newInstance();
            //System.out.println("数据封装之前: "+u);
            //获取类的成员
			Field[] fields = cls.getDeclaredFields();
            
            for(Field field : fields){
                String name = field.getName();
                
                System.out.println(name);
                String[] value = request.getParameterValues(name);
                //创建一个属性描述器
                PropertyDescriptor pd = new PropertyDescriptor(name, cls);
                System.out.println(pd.toString());
                //得到setter属性
                Method setter = pd.getWriteMethod();
                if(value.length==1){
                    setter.invoke(bean, value[0]);
                }else{
                    setter.invoke(bean, (Object)value);
                }
            }
            //System.out.println("封装数据之后: "+u);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return bean;
	}
}
