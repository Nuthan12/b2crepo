# Use an official Node.js runtime as a parent image

FROM node:14-alpine AS base




# Set the working directory to /app

WORKDIR /app




# Copy package.json and package-lock.json

COPY package*.json ./




# Install dependencies

RUN npm install mongoose cors express




# Copy the rest of the application code

COPY . .




# Build the Angular project

# RUN node index.js




# Expose port 2525

EXPOSE 7080




# Start the Node.js server

CMD ["node","index.js"]