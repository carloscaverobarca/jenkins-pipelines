/**
 * Copyright (C) 2019 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author 	Carlos Cavero
 *
 * It creates a Jenkins GitLab Pipeline job using Groovy Domain-Specific Language (DSL)
 * under a specific folder. It accepts Merge Requests to develop branch
 */

[
  '#reponame'
].each { service ->
  
  def lab = '#lab'

  pipelineJob("${lab}/${service}-pipeline-build") {

    description('Test description')
    
    displayName(service + "-pipeline-build")

    triggers {
        gitlabPush {
            buildOnMergeRequestEvents(true)
            buildOnPushEvents(false)
            enableCiSkip(true)
            setBuildDescription(true)
            rebuildOpenMergeRequest('source')
            includeBranches('develop')
			excludeBranches('master')
        }
    }
	
    definition {
        cpsScm {
            lightweight(true)
            scm {
                git {
                    remote {
                        url("#repogit")
                        credentials('#credentials')
		    }
                    branches('*/*')
                }
            }
        }
    }
  }
}