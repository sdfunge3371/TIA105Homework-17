package work08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 請建立一個Collection物件並將以下資料加入:
 * Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
 * Object物件、“Snoopy”、BigInteger(“1000”) 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
 * 移除不是java.lang.Number相關的物件 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
 */
public class Homework01 {

	public static void main(String[] args) {
		Set collect = new HashSet();
		collect.add(new Integer(100));
		collect.add((Double) (3.14));
		collect.add((Long) (21L));
		collect.add((short) 100);
		collect.add("Kitty");
		collect.add(new Object());
		collect.add("Snoopy");
		collect.add(new BigInteger("1000"));

		Set newCollect = new HashSet();

		System.out.println("用Iterator: ");
		Iterator objs = collect.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}

		System.out.println("用for each: ");
		for (Object obj : collect) {
			System.out.println(obj);
			if (obj instanceof Number) {
				newCollect.add(obj);
			}
		}

		System.out.println("移除不是java.lang.Number相關的物件");
// 為何會有 java.util.ConcurrentModificationException ??
		// for (Object obj : collect) {
//			if (!(obj instanceof Number)) {
//				collect.remove(obj);
//			} else {
//				System.out.println(obj);
//			}
//		}

//		for (Object obj : collect) {
//			if (obj.getClass() == Number.class) {
//				newCollect.add(obj);
//			}
//		}

		for (Object obj : newCollect) {
			System.out.println(obj);
		}

	}

}
