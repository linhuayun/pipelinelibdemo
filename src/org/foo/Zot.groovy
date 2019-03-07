package org.foo

def checkOutFrom(repo) {
    echo """git url: "git@github.com:jenkinsci/${repo}" """
}

return this