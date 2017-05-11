package org.drool.rules.impl.test;

import org.drool.rules.bean.Action;
import org.drool.rules.bean.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.drool.rules.api.BookDao;
import org.drool.rules.api.DroolHelper;
import org.drool.rules.api.WeldJUnit4Runner;
import org.drool.rules.bean.Book;
import org.drool.rules.bean.TestInfo;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@RunWith(WeldJUnit4Runner.class)
public class RulesTest {

    @Inject
    private DroolHelper drollHelper;

    @Inject
    private BookDao bookDao;

    @Test
    public void testRulesProducts() {
        Product product = new Product("1.3","12345678",5000.97d);
        System.out.println("Before :\n" + product );
        List<Object> responseObjects = drollHelper.applyRules(Arrays.asList(product));
        responseObjects.forEach(object -> System.out.println("After : \n" + object + "\n\n\n"));
        Assert.assertEquals("Must be equal ..", 1, responseObjects.size());
    }

    @Test
    public void testRulesActions() {
        Action action = new Action("act-1","1.30","preAction","currentAction");
        System.out.println("Before :\n" + action );
        List<Object> responseObjects = drollHelper.applyRules(Arrays.asList(action));
        responseObjects.forEach(object -> System.out.println("After : \n" + object + "\n\n\n"));
        Assert.assertEquals("Must be equal ..", 1, responseObjects.size());
    }

    @Test
    public void testAddBooks() {
        Book book = new Book("Test With CDI");
        book = bookDao.save(book);
        System.out.println("Book :" + book);
    }

    @Test
    public void testFindBooks() {
        List resultList = bookDao.findAll();
        Assert.assertEquals("Mst be  1 ", 1 , resultList.size());
        Assert.assertEquals("Mst be same ", "Test With CDI" , ((Book)resultList.get(0)).getTitle());
    }
}
