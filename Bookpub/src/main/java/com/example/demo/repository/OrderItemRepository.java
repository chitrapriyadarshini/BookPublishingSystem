package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	/*@Query(name = "SELECT SUM(a.qp) total_price FROM(SELECT quantity*price qp FROM order_items JOIN books ON books.id=order_items.book_id WHERE order_id=?1) a", nativeQuery = true)
	public Float findByOrder(Order orderId);
	
	
	@Query(name = "SELECT quantity*price qp FROM order_items JOIN books ON books.id=order_items.book_id WHERE order_id=?1", nativeQuery = true)
	public List<Integer> findByPrice(Long orderId);
*/

	
}