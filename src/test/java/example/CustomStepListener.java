package example;


import net.thucydides.model.domain.DataTable;
import net.thucydides.model.domain.Story;
import net.thucydides.model.domain.TestOutcome;
import net.thucydides.model.domain.TestResult;
import net.thucydides.model.screenshots.ScreenshotAndHtmlSource;
import net.thucydides.model.steps.ExecutedStepDescription;
import net.thucydides.model.steps.StepFailure;
import net.thucydides.model.steps.StepListener;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

public class CustomStepListener implements StepListener {
    @Override
    public void testSuiteStarted(Class<?> aClass) {

    }

    @Override
    public void testSuiteStarted(Story story) {

    }

    @Override
    public void testSuiteStarted(Class<?> testClass, String testCaseName) {
        StepListener.super.testSuiteStarted(testClass, testCaseName);
    }

    @Override
    public void testSuiteFinished() {

    }

    @Override
    public void testStarted(String s) {

    }

    @Override
    public void testStarted(String description, ZonedDateTime startTime) {
        StepListener.super.testStarted(description, startTime);
    }

    @Override
    public void testStarted(String s, String s1) {

    }

    @Override
    public void testStarted(String testName, String testMethod, String id, String scenarioId) {
        StepListener.super.testStarted(testName, testMethod, id, scenarioId);
    }

    @Override
    public void testStarted(String s, String s1, ZonedDateTime zonedDateTime) {

    }

    @Override
    public void testFinished(TestOutcome testOutcome) {
        System.out.println("***Test finished: ***" + testOutcome.getName() );
    }

    @Override
    public void testFinished(TestOutcome result, boolean isInDataDrivenTest) {
        System.out.println("***Test finished DataDriven: ***" + result.getName() );
    }

    @Override
    public void testFinished(TestOutcome testOutcome, boolean b, ZonedDateTime zonedDateTime) {
        System.out.println("***Test finished ZonedDateTime: ***" + testOutcome.getName() );
    }

    @Override
    public void testRetried() {

    }

    @Override
    public void stepStarted(ExecutedStepDescription executedStepDescription) {
        System.out.println("Step started: " + executedStepDescription.getName());

    }

    @Override
    public void stepStarted(ExecutedStepDescription description, ZonedDateTime startTime) {
        StepListener.super.stepStarted(description, startTime);
    }

    @Override
    public void skippedStepStarted(ExecutedStepDescription executedStepDescription) {

    }

    @Override
    public void stepFailed(StepFailure stepFailure) {

    }

    @Override
    public void stepFailed(StepFailure failure, List<ScreenshotAndHtmlSource> screenshotList, boolean isInDataDrivenTest) {
        StepListener.super.stepFailed(failure, screenshotList, isInDataDrivenTest);
    }

    @Override
    public void stepFailed(StepFailure stepFailure, List<ScreenshotAndHtmlSource> list, boolean b, ZonedDateTime zonedDateTime) {

    }

    @Override
    public void lastStepFailed(StepFailure stepFailure) {

    }

    @Override
    public void stepIgnored() {

    }

    @Override
    public void stepPending() {

    }

    @Override
    public void stepPending(String s) {

    }

    @Override
    public void stepFinished() {

    }

    @Override
    public void stepFinished(List<ScreenshotAndHtmlSource> screenshotList) {
        StepListener.super.stepFinished(screenshotList);
    }

    @Override
    public void stepFinished(List<ScreenshotAndHtmlSource> list, ZonedDateTime zonedDateTime) {

    }

    @Override
    public void testFailed(TestOutcome testOutcome, Throwable throwable) {

    }

    @Override
    public void testIgnored() {

    }

    @Override
    public void testSkipped() {

    }

    @Override
    public void testAborted() {
        StepListener.super.testAborted();
    }

    @Override
    public void testPending() {

    }

    @Override
    public void testIsManual() {

    }

    @Override
    public void notifyScreenChange() {

    }

    @Override
    public void useExamplesFrom(DataTable dataTable) {

    }

    @Override
    public void addNewExamplesFrom(DataTable dataTable) {

    }

    @Override
    public void exampleStarted(Map<String, String> map) {

    }

    @Override
    public void exampleStarted(Map<String, String> data, ZonedDateTime time) {
        StepListener.super.exampleStarted(data, time);
    }

    @Override
    public void exampleStarted(Map<String, String> data, String exampleName) {
        StepListener.super.exampleStarted(data, exampleName);
    }

    @Override
    public void exampleStarted(Map<String, String> data, String exampleName, ZonedDateTime time) {
        StepListener.super.exampleStarted(data, exampleName, time);
    }

    @Override
    public void exampleFinished() {

    }

    @Override
    public void assumptionViolated(String s) {

    }

    @Override
    public void testRunFinished() {

    }

    @Override
    public void takeScreenshots(List<ScreenshotAndHtmlSource> list) {

    }

    @Override
    public void takeScreenshots(TestResult testResult, List<ScreenshotAndHtmlSource> list) {

    }
}
