#### Characteristics
- **targetFrame**: [1]
 The target frame.

- **population**: [100]
The size of the population that evolves during the search with a default value of 100.

- **search_budget**: [1800]
The search budget in seconds with a default value of 1800.

- **global_timeout**: [1800]
The global timeout in seconds, after which the execution stops if the search is stuck with a default value of 1800 (the timeout is only reached if the search does not improve after 1800 seconds).

- **test_dir**: [crash-reproduction-tests]
The directory where the tests are generated with a default value of crashreproduction-tests.

#### crashLog

The log with the stack trace to consider.

#### Description
A detailed description of the issue.

#### Steps to reproduce
A detailed description, step-by-step of the procedure followed by the reporter to reproduce the bug reported.

#### Other files and URLs
Additional visual proofs, such as snapshots, providing additional visual information of the bug can be included,
as well as input files required for reproducing the bug or URLs pointed to the sources of such inputs.

#### Relationships
A list of relationships to other issues. In case of features, these relationships can be used to structure them,
grouping related features. Possible relationships:
  - Child of / Parent of
  - Related to
  - Depends on