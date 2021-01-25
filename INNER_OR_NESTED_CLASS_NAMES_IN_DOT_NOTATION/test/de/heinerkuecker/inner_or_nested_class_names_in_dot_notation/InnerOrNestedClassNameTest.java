package de.heinerkuecker.inner_or_nested_class_names_in_dot_notation;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit4 test case for class {@link InnerOrNestedClassName},
 *
 * @author Heiner K&uuml;cker
 */
public class InnerOrNestedClassNameTest
{
    static class Inner
    {
        class InnerInner
        {
            // no implementation
        }

        static class InnerNested
        {
            // no implementation
        }
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_Inner()
    {
        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        Inner.class );

        //System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.Inner";

        Assert.assertEquals(
                expected ,
                actual );
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_InnerInner()
    {
        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        Inner.InnerInner.class );

        //System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.Inner.InnerInner";

        Assert.assertEquals(
                expected ,
                actual );
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_InnerNested()
    {
        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        Inner.InnerNested.class );

        //System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.Inner.InnerNested";

        Assert.assertEquals(
                expected ,
                actual );
    }

    static class Nested
    {
        class NestedInner
        {
            // no implementation
        }

        static class NestedNested
        {
            // no implementation
        }
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_Nested()
    {
        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        Nested.class );

        //System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.Nested";

        Assert.assertEquals(
                expected ,
                actual );
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_NestedInner()
    {
        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        Nested.NestedInner.class );

        //System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.Nested.NestedInner";

        Assert.assertEquals(
                expected ,
                actual );
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_NestedNested()
    {
        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        Nested.NestedNested.class );

        //System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.Nested.NestedNested";

        Assert.assertEquals(
                expected ,
                actual );
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_Anonymous()
    {
        @SuppressWarnings("serial")
        ArrayList<String> anonymous =
                new ArrayList<String>()
        {
            // no implementation
        };

        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        anonymous.getClass() );

        //System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.1";

        Assert.assertEquals(
                expected ,
                actual );
    }

    /**
     * Test for method {@link TypeParameterToStr#innerOrNestedClassName(Class<?>)}
     */
    @Test
    public void testInnerOrNestedClassName_Local()
    {
        class Local
        extends ArrayList<String>
        {
            // no implementation
        }

        final String actual =
                InnerOrNestedClassName.innerOrNestedClassName(
                        Local.class );

        System.out.println( actual );

        final String expected =
                "de.heinerkuecker.inner_or_nested_class_names_in_dot_notation.InnerOrNestedClassNameTest.1Local";

        Assert.assertEquals(
                expected ,
                actual );
    }

}
