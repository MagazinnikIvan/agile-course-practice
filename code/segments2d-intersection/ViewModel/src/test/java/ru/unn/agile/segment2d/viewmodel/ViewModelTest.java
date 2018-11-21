package ru.unn.agile.segment2d.viewmodel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViewModelTest {
    private ViewModel viewModel;

    @Before
    public void createViewModel() {
        viewModel = new ViewModel();
    }

    @After
    public void deleteViewModel() {
        viewModel = null;
    }

    @Test
    public void initViewModelWithDefaultValues() {
        assertEquals("", viewModel.getFirstSegmentFirstPointCoordX());
        assertEquals("", viewModel.getFirstSegmentFirstPointCoordY());
        assertEquals("", viewModel.getFirstSegmentSecondPointCoordX());
        assertEquals("", viewModel.getFirstSegmentSecondPointCoordY());
        assertEquals("", viewModel.getSecondSegmentFirstPointCoordX());
        assertEquals("", viewModel.getSecondSegmentFirstPointCoordY());
        assertEquals("", viewModel.getSecondSegmentSecondPointCoordX());
        assertEquals("", viewModel.getSecondSegmentSecondPointCoordY());
        assertEquals("", viewModel.getFirstSegmentStatus());
        assertEquals("", viewModel.getSecondSegmentStatus());
        assertEquals("", viewModel.getResult());
    }

    @Test
    public void canAllCoordFieldsBeSetted() {
        viewModel.setFirstSegmentFirstPointCoordX("1");
        viewModel.setFirstSegmentFirstPointCoordY("1");
        viewModel.setFirstSegmentSecondPointCoordX("1");
        viewModel.setFirstSegmentSecondPointCoordY("1");
        viewModel.setSecondSegmentFirstPointCoordX("1");
        viewModel.setSecondSegmentFirstPointCoordY("1");
        viewModel.setSecondSegmentSecondPointCoordX("1");
        viewModel.setSecondSegmentSecondPointCoordY("1");

        assertEquals("1", viewModel.getFirstSegmentFirstPointCoordX());
        assertEquals("1", viewModel.getFirstSegmentFirstPointCoordY());
        assertEquals("1", viewModel.getFirstSegmentSecondPointCoordX());
        assertEquals("1", viewModel.getFirstSegmentSecondPointCoordY());
        assertEquals("1", viewModel.getSecondSegmentFirstPointCoordX());
        assertEquals("1", viewModel.getSecondSegmentFirstPointCoordY());
        assertEquals("1", viewModel.getSecondSegmentSecondPointCoordX());
        assertEquals("1", viewModel.getSecondSegmentSecondPointCoordY());
    }

    @Test
    public void canPrintRightStatusForInvalidFirstSegmentCoordsInput() {
        viewModel.setFirstSegmentFirstPointCoordX("1");
        viewModel.setFirstSegmentFirstPointCoordY("d");
        viewModel.setFirstSegmentSecondPointCoordX("1");
        viewModel.setFirstSegmentSecondPointCoordY("1");

        assertEquals("Segment is incorrect!", viewModel.getFirstSegmentStatus());
    }

    @Test
    public void canPrintRightStatusForInvalidSecondSegmentCoordsInput() {
        viewModel.setSecondSegmentFirstPointCoordX("1");
        viewModel.setSecondSegmentFirstPointCoordY("d");
        viewModel.setSecondSegmentSecondPointCoordX("1");
        viewModel.setSecondSegmentSecondPointCoordY("1");

        assertEquals("Segment is incorrect!", viewModel.getSecondSegmentStatus());
    }

    @Test
    public void canPrintRightStatusForInvalidFirstSegment() {
        viewModel.setFirstSegmentFirstPointCoordX("1");
        viewModel.setFirstSegmentFirstPointCoordY("1");
        viewModel.setFirstSegmentSecondPointCoordX("1");
        viewModel.setFirstSegmentSecondPointCoordY("1");

        assertEquals("Segment is incorrect! both Point2D can not be the same", viewModel.getFirstSegmentStatus());
    }

    @Test
    public void canPrintRightStatusForInvalidSecondSegment() {
        viewModel.setSecondSegmentFirstPointCoordX("1");
        viewModel.setSecondSegmentFirstPointCoordY("1");
        viewModel.setSecondSegmentSecondPointCoordX("1");
        viewModel.setSecondSegmentSecondPointCoordY("1");

        assertEquals("Segment is incorrect! both Point2D can not be the same", viewModel.getSecondSegmentStatus());
    }
}