# Git Ignore Lab

## Objective
Learn to exclude unwanted files/folders using `.gitignore`

## Quick Commands
```bash
# Create sample log files
touch error.log access.log
mkdir logs

# Create/modify .gitignore
echo "*.log" >> .gitignore
echo "logs/" >> .gitignore

# Verify ignored files
git status --ignored
```

## GitLab repo
https://gitlab.com/cognizant-practice/GitDemo
