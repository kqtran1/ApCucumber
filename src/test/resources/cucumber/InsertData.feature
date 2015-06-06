Feature: inserted data can be aggregated
  when inserting a set of data the data is aggregated by the system

  Scenario: Data are aggregated on dimensions
    Given the input data
      | Dimension 1 | Dmension 2 | Measure 1 |
      | Dim 1       | Dim 2      | 10.0      |
      | Dim 1       | Dim 3      | 5.0       |
    When Data is aggregated
    Then the output Measure value is 15.0
    And the Underlying is equal to
      | Id | Name            |
      | 1  | Underlying name |