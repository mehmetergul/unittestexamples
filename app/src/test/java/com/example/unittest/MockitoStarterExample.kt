package com.example.unittest

import com.example.unittest.mockitoStarter.Customer
import com.example.unittest.mockitoStarter.Inventory
import com.example.unittest.mockitoStarter.Order
import junit.framework.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test
import org.mockito.Mockito

class MockitoStarterExample {

    @Test
    fun addOrderToCustomer(){
        val inventoryMock = Mockito.mock(Inventory::class.java)
        var order1list = listOf("Item1", "Item2")
        var order2list = listOf("Item3")
        Mockito.`when`<Boolean>(inventoryMock.isStockAvailable("Item1", "Item2")).thenReturn(true)
        Mockito.`when`<Boolean>(inventoryMock.isStockAvailable("Item3")).thenReturn(false)

        val customer = Customer(inventoryMock)
        assertTrue(customer.addOrder(Order(order1list)));
        assertFalse(customer.addOrder(Order(order2list)));
        Mockito.verify(inventoryMock, Mockito.times(1)).isStockAvailable("Item1", "Item2");
        Mockito.verify(inventoryMock, Mockito.times(1)).isStockAvailable("Item3");
    }
}